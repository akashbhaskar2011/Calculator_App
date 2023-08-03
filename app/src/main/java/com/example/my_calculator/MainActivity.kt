package com.example.my_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.my_calculator.ui.theme.Calculator
import com.example.my_calculator.ui.theme.CalculatorActions
import com.example.my_calculator.ui.theme.CalculatorViewModel
import com.example.my_calculator.ui.theme.MediumGray
import com.example.my_calculator.ui.theme.My_CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_CalculatorTheme {

              val viewModel= viewModel<CalculatorViewModel>()
                val state=viewModel.state
                val buttonSpacing= 8.dp
                Calculator(state = state, onAction = viewModel::onAction,
                buttonSpacing = buttonSpacing,
                modifier = Modifier.fillMaxWidth()
                    .background(MediumGray).padding(16.dp))

            }
        }
    }
}

