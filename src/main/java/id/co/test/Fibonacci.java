package id.co.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fibonacci extends AppCompatActivity {
    private TextView tampil;
    private EditText edittext;
    private int hitung = 0; // Memulai dengan indeks 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampil = findViewById(R.id.textView);
        edittext = findViewById(R.id.edittext);

        Button buttonback = findViewById(R.id.button3);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back(view);
            }
        });
    }

    public void max(View view) {
        int hasil = calculateFibonacci(20);
        FibonacciColors(hasil);
    }

    public void count(View view) {
        String input = edittext.getText().toString();
        if (!input.isEmpty()) {
            int n = Integer.parseInt(input);
            int hasil = calculateFibonacci(n);
            FibonacciColors(hasil);
        } else {
            int hasil = calculateFibonacci(hitung);
            FibonacciColors(hasil);
            hitung++; // Menaikkan indeks untuk mendapatkan angka Fibonacci berikutnya
        }
    }

    private int calculateFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;

        int fib1 = 1;
        int fib2 = 1;
        int fibN = 0;

        for (int i = 3; i <= n; i++) {
            fibN = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibN;
        }

        return fibN;
    }

    public void back(View view){
        if (hitung > 0){
            int hasil = calculateFibonacci(hitung);
            FibonacciColors(hasil);
            hitung--;
        }
    }

    private int colorIndex = 0;

    private void FibonacciColors(int fibonacci) {
        TextView textView = findViewById(R.id.textView);
        String fibonacciText = String.valueOf(fibonacci);
        Spannable coloredText = new SpannableString(fibonacciText);

        // Pilih warna dari colors.xml
        int color = getResources().getColor(ColorResource());

        coloredText.setSpan(new ForegroundColorSpan(color), 0, fibonacciText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(coloredText);
    }

    private int ColorResource() {
        int[] colorResources = {R.color.red, R.color.green, R.color.lightblue, R.color.pink, R.color.brown, R.color.ungu, R.color.blue, R.color.white};
        int colorResource = colorResources[colorIndex];
        colorIndex = (colorIndex + 1) % colorResources.length; //
        return colorResource;
    }

}